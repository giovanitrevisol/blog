// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'homepage_controller.dart';

// **************************************************************************
// StoreGenerator
// **************************************************************************

// ignore_for_file: non_constant_identifier_names, unnecessary_brace_in_string_interps, unnecessary_lambdas, prefer_expression_function_bodies, lines_longer_than_80_chars, avoid_as, avoid_annotating_with_dynamic

mixin _$HomepageController on _HomepageController, Store {
  final _$widthPageAtom = Atom(name: '_HomepageController.widthPage');

  @override
  double get widthPage {
    _$widthPageAtom.reportRead();
    return super.widthPage;
  }

  @override
  set widthPage(double value) {
    _$widthPageAtom.reportWrite(value, super.widthPage, () {
      super.widthPage = value;
    });
  }

  final _$_HomepageControllerActionController =
      ActionController(name: '_HomepageController');

  @override
  dynamic changeWidthPage(dynamic value) {
    final _$actionInfo = _$_HomepageControllerActionController.startAction(
        name: '_HomepageController.changeWidthPage');
    try {
      return super.changeWidthPage(value);
    } finally {
      _$_HomepageControllerActionController.endAction(_$actionInfo);
    }
  }

  @override
  String toString() {
    return '''
widthPage: ${widthPage}
    ''';
  }
}
