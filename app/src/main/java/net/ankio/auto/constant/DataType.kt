/*
 * Copyright (C) 2023 ankio(ankio@ankio.net)
 * Licensed under the Apache License, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-3.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package net.ankio.auto.constant

enum class DataType(val type: Int)  {
    App(0),//app
    Sms(1),//短信
    Notice(2),//通知
    Helper(3)//无障碍
}
fun Int.toDataType(): DataType {
    return DataType.values().firstOrNull { it.type == this }?:DataType.App
}