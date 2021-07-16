import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class SlideTile extends StatelessWidget {
  final String image;
  final bool activePage;

  const SlideTile({
    Key? key,
    required this.image,
    required this.activePage,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final double top = this.activePage ? 50 : 150;
    final double blur = this.activePage ? 30 : 0;
    final double offset = this.activePage ? 20 : 0;

    return AnimatedContainer(
      duration: Duration(milliseconds: 500),
      curve: Curves.easeInOutCubic,
      margin: EdgeInsets.fromLTRB(20, top, 20, 100),
      decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(20),
          image: DecorationImage(
            image: AssetImage(this.image),
            fit: BoxFit.cover,
          ),
          boxShadow: [
            BoxShadow(
              color: Colors.black54,
              blurRadius: blur,
              offset: Offset(offset, 0),
            )
          ]),
    );
  }
}
