import 'package:flutter/material.dart';
import 'package:pls_blog_front/presentation/componentes/Carocel.dart';
import 'package:pls_blog_front/presentation/componentes/footer.dart';
import 'package:pls_blog_front/presentation/componentes/header_page.dart';
import 'package:pls_blog_front/presentation/componentes/posts.dart';

class HomePageScreen extends StatefulWidget {
  @override
  _HomePageScreenState createState() => _HomePageScreenState();
}

class _HomePageScreenState extends State<HomePageScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: _buildBody(),
    );
  }

  _buildBody() {
    return SingleChildScrollView(
      child: Padding(
        padding: const EdgeInsets.all(15.0),
        child: Column(
          children: [
            HeaderPage(),
            Carocel(),
            Posts(),
            Footer(),
          ],
        ),
      ),
    );
  }
}
