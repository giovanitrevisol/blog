import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/presentation/home/controller/homepage_controller.dart';

class Posts extends StatelessWidget {
  final _homeController = GetIt.instance.get<HomepageController>();

  Posts({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: _homeController.widthPageLimit(),
      child: Wrap(
        alignment: WrapAlignment.spaceAround,
        spacing: 15,
        runSpacing: 15,
        children: [
          Container(
            width: 500,
            height: 300,
            color: Colors.orange,
          ),
          Container(
            width: 500,
            height: 300,
            color: Colors.orange,
          ),
          Container(
            width: 500,
            height: 300,
            color: Colors.orange,
          ),
          Container(
            width: 500,
            height: 300,
            color: Colors.orange,
          ),
          Container(
            width: 500,
            height: 300,
            color: Colors.orange,
          ),
        ],
      ),
    );
  }
}
