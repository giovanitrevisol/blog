import 'package:mobx/mobx.dart';

part 'homepage_controller.g.dart';

class HomepageController = _HomepageController with _$HomepageController;

abstract class _HomepageController with Store {
  @observable
  double widthPage = 0;

  @action
  changeWidthPage(value) {
    widthPage = value;
  }
}
