package io.joyrpc.protocol.dubbo;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
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
 * #L%
 */

import io.joyrpc.extension.Extension;
import io.joyrpc.extension.condition.ConditionalOnClass;
import io.joyrpc.protocol.ServerProtocol;

import static io.joyrpc.protocol.Protocol.DUBBO_ORDER;

/**
 * Dubbo服务端协议
 */
@Extension(value = "dubbo", order = DUBBO_ORDER)
@ConditionalOnClass("org.apache.dubbo.rpc.Protocol")
public class DubboServerProtocol extends DubboAbstractProtocol implements ServerProtocol {


}
