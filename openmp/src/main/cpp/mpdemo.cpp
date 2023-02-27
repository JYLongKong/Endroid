#include <jni.h>
#include <string>

#include <omp.h>
#include <log4android.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_lgjy_openmp_OpenMPActivity_stringFromJNI(JNIEnv *env, jobject thiz) {

#pragma omp parallel
  LOGI("Hello OpenMP");

  std::string hello = "Hello from C++";
  return env->NewStringUTF(hello.c_str());
}
