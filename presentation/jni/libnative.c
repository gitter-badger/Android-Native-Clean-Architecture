#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_twere_presentation_view_activity_MainActivity_getStringFromNDK(JNIEnv *env, jobject instance) {
    // TODO
    return (*env)->NewStringUTF(env, "Hello");
}