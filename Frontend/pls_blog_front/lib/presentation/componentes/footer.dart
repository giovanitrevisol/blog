import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/presentation/home/controller/homepage_controller.dart';

class Footer extends StatelessWidget {
  final _homeController = GetIt.instance.get<HomepageController>();

  Footer({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 150,
      width: _homeController.widthPageLimit(),
      color: Colors.redAccent,
    );
  }
}
