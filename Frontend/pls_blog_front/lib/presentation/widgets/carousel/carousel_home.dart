import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';
import 'package:pls_blog_front/presentation/widgets/carousel/carousel_controller.dart';
import 'package:pls_blog_front/presentation/widgets/carousel/slide_tite.dart';

class CarouselHome extends StatefulWidget {
  CarouselHome({Key? key}) : super(key: key);

  @override
  _CarouselHomeState createState() => _CarouselHomeState();
}

class _CarouselHomeState extends State<CarouselHome> {
  final PageController _pageController = PageController(viewportFraction: 1);
  final _carouselController = GetIt.instance.get<CarouselController>();

  int _currentPage = 0;

  @override
  void initState() {
    _pageController.addListener(() {
      int next = _pageController.page!.round();
      if (_currentPage != next) {
        setState(() {
          _currentPage = next;
        });
      }
    });
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Expanded(
          child: _buildCaroucel(),
        ),
        _buildBullets(),
      ],
    );
  }
  //

  _buildCaroucel() {
    return Container(
      width: ConstantsUtil.screenPc,
      child: PageView.builder(
        controller: _pageController,
        itemCount: _carouselController.listSlide.length,
        itemBuilder: (_, currentIndex) {
          bool activePage = currentIndex == _currentPage;
          return SlideTile(
            activePage: activePage,
            image: _carouselController.listSlide[
                currentIndex % (_carouselController.listSlide.length)]['image'],
          );
        },
      ),
    );
  }

  Widget _buildBullets() {
    return Padding(
      padding: EdgeInsets.all(8),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        children: _carouselController.listSlide.map((i) {
          return InkWell(
            onTap: () {
              setState(() {
                _pageController.jumpToPage(i['id']);
                _currentPage = i['id'];
              });
            },
            child: Container(
              margin: EdgeInsets.all(10),
              width: 10,
              height: 10,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(30),
                color: _currentPage == i['id'] ? Colors.red : Colors.grey,
              ),
            ),
          );
        }).toList(),
      ),
    );
  }
}
