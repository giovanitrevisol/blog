import 'package:mobx/mobx.dart';
part 'carousel_controller.g.dart';

class CarouselController = _CarouselControllerBase with _$CarouselController;

abstract class _CarouselControllerBase with Store {
  List<Map<String, dynamic>> listSlide = [
    {'id': 0, 'image': 'assets/images/1.jpg'},
    {'id': 1, 'image': 'assets/images/2.jpg'},
    {'id': 2, 'image': 'assets/images/3.png'}
  ];
}

//previsamos usar os change