/*
 * Copyright 2016-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.artifact_cache;

import com.facebook.buck.rules.RuleKey;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class DirArtifactCacheTestUtil {
  private DirArtifactCacheTestUtil() {}

  // This is for DirArtifactCache only.
  public static Path getPathForRuleKey(
      ArtifactCache cache,
      RuleKey ruleKey,
      Optional<String> extension) {
    Preconditions.checkArgument(cache instanceof DirArtifactCache);
    DirArtifactCache dirArtifactCache = (DirArtifactCache) cache;
    return dirArtifactCache.getPathForRuleKey(ruleKey, extension);
  }

  public static File[] getAllFilesInCache(ArtifactCache cache) throws IOException {
    Preconditions.checkArgument(cache instanceof DirArtifactCache);
    DirArtifactCache dirArtifactCache = (DirArtifactCache) cache;
    return dirArtifactCache.getAllFilesInCache();
  }
}
