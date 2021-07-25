import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

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
          headline1: GoogleFonts.josefinSans(
            textStyle: TextStyle(
                color: Colors.white,
                fontSize: 24,
                fontWeight: FontWeight.bold,
                fontStyle: FontStyle.normal),
          ),
          headline2: GoogleFonts.josefinSans(
            textStyle: TextStyle(
              fontSize: 36,
              color: Colors.white,
            ),
          ),
          headline3: GoogleFonts.josefinSans(
            textStyle: TextStyle(fontSize: 32, height: 1.3),
          ),
          headline4: GoogleFonts.josefinSans(
            textStyle: TextStyle(fontSize: 28, height: 1.3),
          ),
          headline5: GoogleFonts.josefinSans(
            textStyle: TextStyle(
                color: Colors.white,
                fontSize: 20,
                fontWeight: FontWeight.bold,
                fontStyle: FontStyle.normal),
          ),
          headline6: GoogleFonts.josefinSans(
            textStyle: TextStyle(
              color: ColorMain.whiteColor,
              fontSize: 30,
              fontWeight: FontWeight.bold,
              fontStyle: FontStyle.normal,
            ),
          ),
          bodyText2: GoogleFonts.josefinSans(
            textStyle: TextStyle(
              fontSize: 18,
              height: 1.3,
              color: Colors.black87,
            ),
          ),
          bodyText1: GoogleFonts.josefinSans(
            textStyle: TextStyle(
              fontSize: 17,
              height: 1.3,
              fontWeight: FontWeight.w500,
            ),
          ),
          button: GoogleFonts.josefinSans(
            textStyle: TextStyle(
              fontSize: 20,
              height: 1.3,
              color: Colors.white,
              fontWeight: FontWeight.bold,
            ),
          ),
        ),
        toggleableActiveColor: ColorMain.colorMainApp,
        accentTextTheme: TextTheme(bodyText2: TextStyle(color: Colors.black)),
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
