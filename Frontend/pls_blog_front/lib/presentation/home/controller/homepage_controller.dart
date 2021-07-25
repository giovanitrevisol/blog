import 'package:mobx/mobx.dart';
import 'package:pls_blog_front/presentation/util/contants/contants_util.dart';

part 'homepage_controller.g.dart';

class HomepageController = _HomepageController with _$HomepageController;

abstract class _HomepageController with Store {
  @observable
  double widthPage = 0;

  @action
  changeWidthPage(value) {
    widthPage = value;
  }

  double widthPageLimit() {
    if (widthPage < ConstantsUtil.screenPc) {
      return widthPage;
    } else {
      return ConstantsUtil.screenPc;
    }
  }
}
