import 'package:flutter/material.dart';

import 'color_main.dart';

class WhiteTheme {
  ThemeData white() => ThemeData(
        primarySwatch: ColorMain.whiteColor,
        primaryColor: ColorMain.colorMainApp,
        brightness: Brightness.light,
        disabledColor: Colors.black54,
        // inputDecorationTheme: InputDecorationTheme(
        //   alignLabelWithHint: true,
        //   hintStyle: TextStyle(color: ColorMain.whiteColor, fontSize: 18),
        //   labelStyle: TextStyle(color: Colors.green, fontSize: 16),
        //   floatingLabelBehavior: FloatingLabelBehavior.always,
        //   focusColor: Colors.white10,
        // ),
        textTheme: TextTheme(
          headline1: TextStyle(
              color: Colors.white,
              fontSize: 24,
              fontWeight: FontWeight.bold,
              fontStyle: FontStyle.normal),
          headline2: TextStyle(fontSize: 36, height: 1.3),
          headline3: TextStyle(fontSize: 32, height: 1.3),
          headline4: TextStyle(fontSize: 28, height: 1.3),
          headline5: TextStyle(
              color: Colors.black87,
              fontSize: 20,
              fontWeight: FontWeight.bold,
              fontStyle: FontStyle.normal),
          headline6: TextStyle(
            color: ColorMain.whiteColor,
            fontSize: 30,
            fontWeight: FontWeight.bold,
            fontStyle: FontStyle.normal,
          ),
          bodyText2: TextStyle(
            fontSize: 18,
            height: 1.3,
            color: Colors.black87,
          ),
          bodyText1: TextStyle(fontSize: 14, height: 1.3),
          button: TextStyle(
            fontSize: 16,
            height: 1.3,
            fontWeight: FontWeight.bold,
          ),
        ),
        bottomAppBarTheme:
            BottomAppBarTheme(color: ColorMain.whiteColor, elevation: 3),
        buttonTheme: ButtonThemeData(
          buttonColor: Colors.green,
          disabledColor: Colors.green.shade500,
          textTheme: ButtonTextTheme.primary,
          padding: EdgeInsets.all(10),
        ),
        toggleableActiveColor: ColorMain.colorMainApp,
        accentTextTheme: TextTheme(bodyText2: TextStyle(color: Colors.black)),
        cardTheme: CardTheme(elevation: 3, color: Colors.white),
        accentColorBrightness: Brightness.light,
        accentColor: ColorMain.colorMainApp,
        backgroundColor: Colors.white,
        splashColor: ColorMain.whiteColor.withOpacity(.2),
        hoverColor: ColorMain.whiteColor.withOpacity(.4),
        textButtonTheme: TextButtonThemeData(
          style: TextButton.styleFrom(
            primary: Colors.green, //cor primária do botão
            backgroundColor: Colors.transparent,
            textStyle: const TextStyle(
              fontSize: 18,
              backgroundColor: Colors.transparent,
            ),
          ),
        ),
      );
}
