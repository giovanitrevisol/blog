import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/presentation/home/controller/homepage_controller.dart';
import 'package:pls_blog_front/presentation/widgets/link_menu.dart';

class HeaderPage extends StatelessWidget {
  const HeaderPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // var largura = MediaQuery.of(context).size.width;
    final _homeController = GetIt.instance.get<HomepageController>();

    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Container(
          width: _homeController.widthPageLimit(),
          color: Colors.blue,
          height: 150,
          child: Row(
            children: [
              Image.asset(
                'assets/images/pls-logo-tarja.png',
                alignment: Alignment.centerLeft,
              ),
              Expanded(
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.end,
                  children: [
                    LinkMenu(
                      onTap: () {},
                      text: 'text',
                    )
                  ],
                ),
              ),
            ],
          ),
        )
      ],
    );
  }
}
