/*
 * Copyright 2024 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Foundation

/// Gets the padding for the current element
/// - Parameters:
///   - bufSize: Current size of the buffer + the offset of the object to be written
///   - elementSize: Element size
@inline(__always)
public func padding(
  bufSize: UInt,
  elementSize: UInt) -> UInt
{
  ((~bufSize) &+ 1) & (elementSize &- 1)
}
