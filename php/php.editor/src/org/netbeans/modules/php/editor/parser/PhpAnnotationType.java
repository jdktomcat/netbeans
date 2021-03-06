/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.editor.parser;

import java.util.Map;
import org.netbeans.modules.csl.api.OffsetRange;

/**
 *
 * @author Ondrej Brejla <obrejla@netbeans.org>
 */
public interface PhpAnnotationType {

    /**
     * Returns a name of an annotation without the "at" sign.
     *
     * @return Name.
     */
    String getName();

    /**
     * Returns a description of a tag.
     *
     * @return Description.
     */
    String getDescription();

    /**
     * Returns an offset-ranges and their types.
     *
     * @return Type in an offset-range.
     */
    Map<OffsetRange, String> getTypes();

}
