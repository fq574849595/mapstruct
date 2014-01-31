/**
 *  Copyright 2012-2014 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.factories;

import org.mapstruct.ap.test.factories.a.BarFactory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Sjaak Derksen
 *
 */
@Mapper( uses = { BarFactory.class, org.mapstruct.ap.test.factories.b.BarFactory.class } )
public abstract class SourceTargetMapperAndBar2Factory {
    public static final SourceTargetMapperAndBar2Factory INSTANCE =
            Mappers.getMapper( SourceTargetMapperAndBar2Factory.class );

    public abstract Target sourceToTarget(Source source);

    public abstract Bar1 foo1ToBar1(Foo1 foo1);

    public abstract Bar2 foo2ToBar2(Foo2 foo2);

    public abstract Bar3 foo3ToBar3(Foo3 foo3);

    public Bar2 createBar2() {
        return new Bar2("BAR2");
    }
}
