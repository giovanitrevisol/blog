import 'dart:ui';

import 'package:flutter/material.dart';

class ColorMain {
  static MaterialColor whiteColor = MaterialColor(colorMainAppHexa, color);
  //cor pricipal em GRBO
  static Color colorMainApp = Color.fromRGBO(50, 146, 55, 1);

  //cor pricipal em HEXADECIMAL
  static int colorMainAppHexa = 0xFF329237;

//
  static Map<int, Color> color = {
    50: Color.fromRGBO(50, 146, 55, .1),
    100: Color.fromRGBO(50, 146, 55, .2),
    200: Color.fromRGBO(50, 146, 55, .3),
    300: Color.fromRGBO(50, 146, 55, .4),
    400: Color.fromRGBO(50, 146, 55, .5),
    500: Color.fromRGBO(50, 146, 55, .6),
    600: Color.fromRGBO(50, 146, 55, .7),
    700: Color.fromRGBO(50, 146, 55, .8),
    800: Color.fromRGBO(50, 146, 55, .9),
    900: Color.fromRGBO(50, 146, 55, 1),
  };
}
