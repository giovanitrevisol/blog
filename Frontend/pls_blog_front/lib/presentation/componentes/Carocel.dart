import 'package:flutter/material.dart';

class Carocel extends StatelessWidget {
  const Carocel({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 500,
      width: 1000,
      color: Colors.red,
      child: Text("Aqui vai ter um carocel"),
    );
  }
}
