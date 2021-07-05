import 'package:flutter/material.dart';

import 'color_main.dart';

class DarkTheme {
  //
  ThemeData dark() => ThemeData(
        primarySwatch: ColorMain.whiteColor,
        // appBarTheme: AppBarTheme(
        //   actionsIconTheme: IconThemeData(color: Colors.white, size: 40),
        //   iconTheme: IconThemeData(color: Colors.white, size: 30),
        //   color: ColorMain.colorMainApp,
        //   textTheme: TextTheme(
        //     headline1: TextStyle(
        //         color: Colors.white,
        //         fontSize: 24,
        //         fontWeight: FontWeight.bold,
        //         fontStyle: FontStyle.normal),
        //     headline2: TextStyle(fontSize: 36, height: 1.3),
        //     headline3: TextStyle(fontSize: 32, height: 1.3),
        //     headline4: TextStyle(fontSize: 28, height: 1.3),
        //     headline5: TextStyle(
        //         color: Colors.white,
        //         fontSize: 20,
        //         fontWeight: FontWeight.bold,
        //         fontStyle: FontStyle.normal),
        //     headline6: TextStyle(
        //       color: Colors.white,
        //       fontSize: 20,
        //       fontWeight: FontWeight.bold,
        //       fontStyle: FontStyle.normal,
        //     ),
        //     bodyText1: TextStyle(fontSize: 16, height: 1.3),
        //     bodyText2: TextStyle(color: Colors.white),
        //     subtitle1: TextStyle(fontSize: 16, height: 1.3),
        //     subtitle2: TextStyle(fontSize: 14, height: 1.3),
        //   ),
        // ),
        brightness: Brightness.dark,
        primaryColor: ColorMain.colorMainApp,
        disabledColor: Colors.black87,
        inputDecorationTheme: InputDecorationTheme(
          alignLabelWithHint: true,
          hintStyle: TextStyle(
            color: Colors.white,
            fontSize: 14,
            fontWeight: FontWeight.normal,
          ),
          labelStyle: TextStyle(
            color: ColorMain.colorMainApp,
            fontSize: 16,
          ),
          floatingLabelBehavior: FloatingLabelBehavior.auto,
          fillColor: Colors.grey[800],
          hoverColor: Colors.grey[700],
        ),

        textTheme: TextTheme(
          headline1: TextStyle(
              color: Colors.white,
              fontSize: 24,
              fontWeight: FontWeight.bold,
              fontStyle: FontStyle.normal),
          headline2: TextStyle(
            fontSize: 36,
            height: 1.0,
          ),
          headline3: TextStyle(
            fontSize: 32,
            height: 1.0,
          ),
          headline4: TextStyle(
            fontSize: 28,
            height: 1.0,
          ),
          headline5: TextStyle(
            color: Colors.black87,
            fontSize: 20,
            fontStyle: FontStyle.normal,
          ),
          headline6: TextStyle(
            color: ColorMain.whiteColor,
            fontSize: 30,
            fontStyle: FontStyle.normal,
          ),
          bodyText2: TextStyle(
            fontSize: 16,
            height: 1.3,
          ),
          bodyText1: TextStyle(
            fontSize: 18,
            height: 1.3,
          ),
          button: TextStyle(
            fontSize: 15,
            height: 1.2,
            color: Colors.white,
            letterSpacing: 1.1,
          ),
        ),
        bottomAppBarTheme:
            BottomAppBarTheme(color: ColorMain.whiteColor, elevation: 3),
        buttonTheme: ButtonThemeData(
          buttonColor: ColorMain.colorMainApp,
          hoverColor: ColorMain.colorMainApp,
          highlightColor: ColorMain.color[900],
        ),

        toggleableActiveColor: ColorMain.colorMainApp,
        accentTextTheme: TextTheme(bodyText2: TextStyle(color: Colors.white)),
        cardTheme: CardTheme(elevation: 3, color: Colors.black54),
        accentColorBrightness: Brightness.light,
        accentColor: ColorMain.colorMainApp,
        backgroundColor: Colors.white,
        splashColor: ColorMain.whiteColor.withOpacity(.2),
        hoverColor: ColorMain.whiteColor.withOpacity(.4),
      );
}
