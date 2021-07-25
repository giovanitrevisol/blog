import 'package:flutter/material.dart';
import 'package:pls_blog_front/models/Project.dart';
import 'package:pls_blog_front/presentation/responsive.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';
import 'package:pls_blog_front/presentation/util/theme/color_main.dart';

class CardPost extends StatelessWidget {
  const CardPost({
    Key? key,
    required this.project,
  }) : super(key: key);

  final Project project;

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(10),
        color: ColorMain.color[700],
      ),
      padding: const EdgeInsets.all(ConstantsUtil.defaultPadding),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            project.title!,
            maxLines: 2,
            overflow: TextOverflow.ellipsis,
            style: Theme.of(context).textTheme.headline5,
          ),
          Spacer(),
          Text(
            project.description!,
            maxLines: Responsive.isMobileLarge(context) ? 3 : 4,
            overflow: TextOverflow.ellipsis,
            style: Theme.of(context).textTheme.bodyText1,
          ),
          Spacer(),
          TextButton(
            onPressed: () {},
            child: Text(
              "Mais...",
              style: Theme.of(context).textTheme.button,
            ),
          ),
        ],
      ),
    );
  }
}
