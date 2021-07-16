import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/pls_blog.dart';
import 'package:pls_blog_front/presentation/home/controller/homepage_controller.dart';
import 'package:pls_blog_front/presentation/widgets/carousel/carousel_controller.dart';

void main() {
  GetIt getIt = GetIt.instance;

  getIt.registerSingleton<HomepageController>(HomepageController());
  getIt.registerSingleton<CarouselController>(CarouselController());

  // getIt.registerLazySingletonAsync<HomepageController>(
  //     () async => HomepageController());

  runApp(
    PlsBlog(),
  );
}
