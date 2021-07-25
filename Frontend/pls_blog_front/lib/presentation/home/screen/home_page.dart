import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/presentation/componentes/footer.dart';
import 'package:pls_blog_front/presentation/componentes/header_page.dart';
import 'package:pls_blog_front/presentation/componentes/posts.dart';
import 'package:pls_blog_front/presentation/home/controller/homepage_controller.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';
import 'package:pls_blog_front/presentation/widgets/carousel/carousel_home.dart';

class HomePageScreen extends StatefulWidget {
  @override
  _HomePageScreenState createState() => _HomePageScreenState();
}

class _HomePageScreenState extends State<HomePageScreen> {
  final _homeController = GetIt.instance.get<HomepageController>();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: _buildBody(),
    );
  }

  _buildBody() {
    return LayoutBuilder(
      builder: (buildContext, contraints) {
        _homeController.changeWidthPage(contraints.maxWidth);
        if (_homeController.widthPage < ConstantsUtil.screenSmartphone) {
          return _smartphones();
        } else {
          return _desktop(); //maior que 960px até 1280
        }
      },
    );
  }
}

_smartphones() {
  return Container(
    color: Colors.red[50],
    child: Text("Celulares"),
  );
}

_desktop() {
  return SingleChildScrollView(
    //ou usar um listview
    child: Column(
      children: [
        HeaderPage(),
        _aquiCarousel(),
        Posts(),
        Footer(),
      ],
    ),
  );
}

_aquiCarousel() {
  return Container(
    child: Image.asset('assets/images/1.jpg'),
  );
}
