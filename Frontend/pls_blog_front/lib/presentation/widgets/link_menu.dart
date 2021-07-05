import 'package:flutter/material.dart';

class LinkMenu extends StatefulWidget {
  final Function() onTap;
  final String text;

  const LinkMenu({
    Key? key,
    required this.onTap,
    required this.text,
  }) : super(key: key);

  @override
  _LinkMenuState createState() => _LinkMenuState();
}

class _LinkMenuState extends State<LinkMenu> {
  double scale = 1.0;
  bool isHover = false;

  @override
  Widget build(BuildContext context) {
    return MouseRegion(
      onEnter: (e) => _mouseEnter(true),
      onExit: (e) => _mouseEnter(false),
      child: TweenAnimationBuilder(
        duration: const Duration(milliseconds: 100),
        tween: Tween<double>(begin: 1.0, end: scale),
        builder: (BuildContext context, double value, _) {
          return Transform.scale(
            scale: value,
            child: Row(
              children: [
                Text(
                  widget.text,
                  style:
                      TextStyle(color: isHover ? Colors.green : Colors.black),
                ),
              ],
            ),
          );
        },
      ),
    );
  }

  void _mouseEnter(bool hover) {
    setState(() {
      if (hover) {
        scale = 1.1;
        isHover = true;
      } else {
        scale = 1.0;
        isHover = false;
      }
    });
  }
}
