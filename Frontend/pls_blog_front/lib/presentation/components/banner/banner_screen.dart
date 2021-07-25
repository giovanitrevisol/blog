import 'package:animated_text_kit/animated_text_kit.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:pls_blog_front/presentation/responsive.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';

class BannerScreen extends StatelessWidget {
  const BannerScreen({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return AspectRatio(
      aspectRatio: Responsive.isMobile(context) ? 2.5 : 3,
      child: Stack(
        fit: StackFit.expand,
        children: [
          Image.asset(
            'assets/images/capa.jpg',
            fit: BoxFit.cover,
            alignment: Alignment.bottomCenter,
          ),
          Container(color: Colors.black.withOpacity(0.60)),
          Padding(
            padding: const EdgeInsets.symmetric(
                horizontal: ConstantsUtil.defaultPadding),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                _buildPsicologaLaraSantiago(context),
                if (Responsive.isMobileLarge(context))
                  const SizedBox(height: ConstantsUtil.defaultPadding / 2),
                buildAnimatedText(context),
              ],
            ),
          )
        ],
      ),
    );
  }
}

_buildPsicologaLaraSantiago(BuildContext context) {
  return Text(
    "Psicóloga Lara Santiago",
    style: GoogleFonts.satisfy(
      textStyle: TextStyle(
        fontSize: Responsive.isMobileLarge(context) ? 35 : 60,
        fontWeight: FontWeight.bold,
        color: Colors.white,
        letterSpacing: 2.1,
      ),
    ),
  );
}

buildAnimatedText(BuildContext context) {
  return DefaultTextStyle(
    style: Theme.of(context).textTheme.subtitle2!,
    maxLines: 2,
    child: Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Responsive.isMobile(context)
            ? Expanded(child: animatedText(context))
            : animatedText(context),
        if (!Responsive.isMobileLarge(context))
          SizedBox(width: ConstantsUtil.defaultPadding / 2),
      ],
    ),
  );
}

animatedText(BuildContext context) {
  return AnimatedTextKit(
    animatedTexts: [
      TyperAnimatedText(
        "Psicologia Clínica...",
        textStyle: Theme.of(context).textTheme.headline2,
        speed: Duration(milliseconds: 120),
      ),
      TyperAnimatedText(
        "Psicologia das Organizações e do Trabalho...",
        textStyle: Theme.of(context).textTheme.headline2,
        speed: Duration(milliseconds: 120),
      ),
      TyperAnimatedText(
        "Docência em Psicologia...",
        textStyle: Theme.of(context).textTheme.headline2,
        speed: Duration(milliseconds: 120),
      ),
    ],
  );
}
