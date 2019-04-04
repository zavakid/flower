/**
 * Copyright © 2019 同程艺龙 (zhihui.li@ly.com)
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
/**
 * 
 */
package com.ly.train.flower.common.service.container;

import java.util.Set;
import com.ly.train.flower.config.FlowerConfig;
import com.ly.train.flower.registry.Registry;

/**
 * @author leeyazhou
 *
 */
public interface FlowerFactory {


  /**
   * 获取Flower容器配置信息
   * 
   * @return {@link FlowerConfig}
   */
  FlowerConfig getFlowerConfig();

  Set<Registry> getRegistry();

  /**
   * 初始化
   * 
   * @return true / false
   */
  boolean init();

}