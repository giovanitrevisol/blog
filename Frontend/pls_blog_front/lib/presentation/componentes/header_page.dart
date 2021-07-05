import 'package:flutter/material.dart';
import 'package:pls_blog_front/presentation/widgets/link_menu.dart';

class HeaderPage extends StatelessWidget {
  const HeaderPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    var largura = MediaQuery.of(context).size.width;

    return Row(
      children: [
        Container(
          width: largura * .2,
          child: Image.asset(
            'pls-logo-tarja.png',
            width: 300,
            alignment: Alignment.centerLeft,
          ),
        ),
        Container(
          width: largura * .7,
          child: Row(
            mainAxisAlignment: MainAxisAlignment.end,
            children: [
              LinkMenu(
                  onTap: () {
                    print('precionado ontap');
                  },
                  text: "Link"),
              //TesteButton(),
            ],
          ),
        )
      ],
    );
  }
}
