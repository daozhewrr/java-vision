/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/face.proto

package com.google.cloud.vision.v1p4beta1;

public interface FaceRecognitionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.FaceRecognitionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   */
  java.util.List<java.lang.String> getCelebritySetList();
  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   */
  int getCelebritySetCount();
  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   */
  java.lang.String getCelebritySet(int index);
  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   */
  com.google.protobuf.ByteString getCelebritySetBytes(int index);
}
