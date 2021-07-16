import 'package:flutter/material.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';
import 'package:pls_blog_front/presentation/widgets/link_menu.dart';

class HeaderPage extends StatelessWidget {
  const HeaderPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // var largura = MediaQuery.of(context).size.width;
    // final _homeController = GetIt.instance.get<HomepageController>();

    return Container(
      color: Colors.green,
      height: 100,
      width: ConstantsUtil.screenPc,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Image.asset(
            'assets/images/pls-logo-tarja.png',
            alignment: Alignment.centerLeft,
          ),
          Container(
            color: Colors.amber,
            width: ConstantsUtil.screenTablet * 0.6,
            child: Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: [
                LinkMenu(
                  onTap: () {},
                  text: 'text',
                )
              ],
            ),
          )
        ],
      ),
    );
  }
}
