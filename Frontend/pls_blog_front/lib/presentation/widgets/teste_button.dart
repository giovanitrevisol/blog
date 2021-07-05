import 'package:flutter/material.dart';

class TesteButton extends StatefulWidget {
  const TesteButton({Key? key}) : super(key: key);

  @override
  _TesteButtonState createState() => _TesteButtonState();
}

class _TesteButtonState extends State<TesteButton> {
  bool isHovered = false;

  @override
  void initState() {
    super.initState();
  }

  hoverActivation(hoverState) {
    setState(() {
      isHovered = hoverState;
    });
    print("activated" + hoverState.toString());
  }

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: MouseRegion(
        onHover: (event) {
          hoverActivation(true);
        },
        onExit: (event) {
          hoverActivation(false);
        },
        onEnter: (event) {
          print('---- precisonado enter!');
        },
        child: Text(
          'data',
          style: TextStyle(color: isHovered ? Colors.red : Colors.black),
        ),
      ),
    );
  }
}
