import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';
import 'package:pls_blog_front/pls_blog.dart';

void main() {
  GetIt getIt = GetIt.instance;

  //getIt.registerSingleton<HomepageController>(HomepageController());

  // getIt.registerLazySingletonAsync<HomepageController>(
  //     () async => HomepageController());

  runApp(
    PlsBlog(),
  );
}
