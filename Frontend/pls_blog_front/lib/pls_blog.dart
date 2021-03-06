import 'package:flutter/material.dart';
import 'package:pls_blog_front/presentation/components/banner/banner_screen.dart';
import 'package:pls_blog_front/presentation/components/footer/footer.dart';
import 'package:pls_blog_front/presentation/components/main_screen.dart';
import 'package:pls_blog_front/presentation/components/posts/posts_screen.dart';
import 'package:pls_blog_front/presentation/util/theme/white_theme.dart';

class PlsBlog extends StatefulWidget {
  const PlsBlog({Key? key}) : super(key: key);

  @override
  _PlsBlogState createState() => _PlsBlogState();
}

class _PlsBlogState extends State<PlsBlog> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Psicóloga Lara Santiago - Blog',
      debugShowCheckedModeBanner: false,
      theme: WhiteTheme().white(),
      //
      home: MainScreen(
        children: [
          BannerScreen(),
          const SizedBox(height: 15),
          PostsScreen(),
          Footer(),
        ],
      ),
    );
  }
}
