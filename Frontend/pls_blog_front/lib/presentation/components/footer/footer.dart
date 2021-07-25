import 'package:flutter/material.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';
import 'package:pls_blog_front/presentation/util/theme/color_main.dart';

class Footer extends StatelessWidget {
  const Footer({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(ConstantsUtil.defaultPadding),
      child: Row(
        children: [
          _buildFacebook(),
          _buildFacebook(),
          _buildFacebook(),
        ],
      ),
    );
  }

  _buildFacebook() {
    return Expanded(
      child: Center(
        child: IconButton(
          color: ColorMain.colorMainApp,
          onPressed: () {},
          icon: Icon(
            Icons.facebook,
          ),
        ),
      ),
    );
  }
}
