import 'package:flutter/material.dart';
import 'package:pls_blog_front/models/Project.dart';
import 'package:pls_blog_front/presentation/components/posts/card_post.dart';
import 'package:pls_blog_front/presentation/responsive.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';

class PostsScreen extends StatelessWidget {
  const PostsScreen({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.symmetric(
          horizontal: Responsive.isMobile(context)
              ? ConstantsUtil.defaultPadding / 4
              : ConstantsUtil.defaultPadding),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            "Posts",
            style: Theme.of(context).textTheme.headline6,
          ),
          const SizedBox(height: ConstantsUtil.defaultPadding),
          Responsive(
            mobile: _showPostsDisplay(
              crossAxisCount: 1,
              childAspectRatio: 1.7,
            ),
            mobileLarge: _showPostsDisplay(crossAxisCount: 2),
            tablet: _showPostsDisplay(childAspectRatio: 1.1),
            desktop: _showPostsDisplay(),
          )
        ],
      ),
    );
  }
}

_showPostsDisplay({int crossAxisCount = 3, double childAspectRatio = 1.3}) {
  return GridView.builder(
    shrinkWrap: true,
    physics: NeverScrollableScrollPhysics(),
    itemCount: demo_projects.length,
    gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
      crossAxisCount: crossAxisCount,
      childAspectRatio: childAspectRatio,
      crossAxisSpacing: ConstantsUtil.defaultPadding,
      mainAxisSpacing: ConstantsUtil.defaultPadding,
    ),
    itemBuilder: (context, index) => CardPost(
      project: demo_projects[index],
    ),
  );
}
