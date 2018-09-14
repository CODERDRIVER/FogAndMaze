# FogAndMaze
雾霾探测系统(http://localhost:8080/index)
# 技术栈
后端：springboot
前端：jquery+ajax+Chart.js
数据来源：
- 聚合数据 https://www.juhe.cn/myData
- 百度地图
# 工具
- git
- idea
- maven
- postman
# 项目搭建
1. git clone https://github.com/CODERDRIVER/FogAndMaze.git 下载项目
2. 用idea打开项目，根据pom文件引入依赖
3. 运行FogandhazeApplication主程序文件
4. 打开浏览器访问 http://localhost:8080/index

# 项目调用过程
 前端通过ajax调用请求springboot本地服务接口，本地服务通过http请求聚合数据接口API访问数据，将得到的数据然后返回给前端，前端通过数据填充，完成页面的渲染
## 间接调用的原因
1. 前端直接访问聚合数据接口会出现跨域问题
2. 在springboot后端请求数据时可以对数据进行封装处理，以及其他逻辑处理，比较方便，减轻了前端的业务处理
# 接口
1. 请求位置信息
- url: http://api.map.baidu.com/api?v=2.0&ak=**
2. 请求某个城市的空气质量
- url: http://localhost:8080/urbanAirQuality
- 请求参数：city
- 返回参数
```json
{
    "resultcode": "200",
    "reason": "SUCCESSED!",
    "error_code": 0,
    "result": [
        {
            "citynow": {
                "city": "suzhou",
                "AQI": "77",
                "quality": "良",
                "date": "2014-05-09 14:00"
            },
            "lastTwoWeeks": {
                "1": {
                    "city": "suzhou",
                    "AQI": "100",
                    "quality": "良",
                    "date": "2014-05-08"
                },
                "2": {
                    "city": "suzhou",
                    "AQI": "99",
                    "quality": "良",
                    "date": "2014-05-07"
                },
                "3": {
                    "city": "suzhou",
                    "AQI": "77",
                    "quality": "良",
                    "date": "2014-05-06"
                },
                "4": {
                    "city": "suzhou",
                    "AQI": "75",
                    "quality": "良",
                    "date": "2014-05-05"
                },
                "5": {
                    "city": "suzhou",
                    "AQI": "78",
                    "quality": "良",
                    "date": "2014-05-04"
                },
                "6": {
                    "city": "suzhou",
                    "AQI": "84",
                    "quality": "良",
                    "date": "2014-05-03"
                },
                "7": {
                    "city": "suzhou",
                    "AQI": "135",
                    "quality": "轻度污染",
                    "date": "2014-05-02"
                },
                "8": {
                    "city": "suzhou",
                    "AQI": "126",
                    "quality": "轻度污染",
                    "date": "2014-05-01"
                },
                "9": {
                    "city": "suzhou",
                    "AQI": "87",
                    "quality": "良",
                    "date": "2014-04-30"
                },
                "10": {
                    "city": "suzhou",
                    "AQI": "97",
                    "quality": "良",
                    "date": "2014-04-29"
                },
                "11": {
                    "city": "suzhou",
                    "AQI": "77",
                    "quality": "良",
                    "date": "2014-04-28"
                },
                "12": {
                    "city": "suzhou",
                    "AQI": "84",
                    "quality": "良",
                    "date": "2014-04-27"
                },
                "13": {
                    "city": "suzhou",
                    "AQI": "45",
                    "quality": "优",
                    "date": "2014-04-26"
                },
                "14": {
                    "city": "suzhou",
                    "AQI": "56",
                    "quality": "良",
                    "date": "2014-04-25"
                },
                "15": {
                    "city": "suzhou",
                    "AQI": "83",
                    "quality": "良",
                    "date": "2014-04-24"
                },
                "16": {
                    "city": "suzhou",
                    "AQI": "95",
                    "quality": "良",
                    "date": "2014-04-23"
                },
                "17": {
                    "city": "suzhou",
                    "AQI": "101",
                    "quality": "轻度污染",
                    "date": "2014-04-22"
                }
            },
            "lastMoniData": {
                "1": {
                    "city": "上方山",
                    "AQI": "77",
                    "quality": "良",
                    "PM2.5Hour": "46μg/m³",
                    "PM2.5Day": "46μg/m³",
                    "PM10Hour": "104μg/m³",
                    "lat": "31.247222",
                    "lon": "120.561389"
                },
                "2": {
                    "city": "南门",
                    "AQI": "112",
                    "quality": "轻度污染",
                    "PM2.5Hour": "84μg/m³",
                    "PM2.5Day": "84μg/m³",
                    "PM10Hour": "—μg/m³",
                    "lat": "31.286389",
                    "lon": "120.6275"
                },
                "3": {
                    "city": "彩香",
                    "AQI": "76",
                    "quality": "良",
                    "PM2.5Hour": "46μg/m³",
                    "PM2.5Day": "46μg/m³",
                    "PM10Hour": "101μg/m³",
                    "lat": "31.301944",
                    "lon": "120.590833"
                },
                "4": {
                    "city": "轧钢厂",
                    "AQI": "68",
                    "quality": "良",
                    "PM2.5Hour": "41μg/m³",
                    "PM2.5Day": "41μg/m³",
                    "PM10Hour": "85μg/m³",
                    "lat": "31.326389",
                    "lon": "120.595556"
                },
                "5": {
                    "city": "吴中区",
                    "AQI": "64",
                    "quality": "良",
                    "PM2.5Hour": "46μg/m³",
                    "PM2.5Day": "46μg/m³",
                    "PM10Hour": "—μg/m³",
                    "lat": "31.270278",
                    "lon": "120.612778"
                },
                "6": {
                    "city": "苏州新区",
                    "AQI": "72",
                    "quality": "良",
                    "PM2.5Hour": "46μg/m³",
                    "PM2.5Day": "46μg/m³",
                    "PM10Hour": "93μg/m³",
                    "lat": "31.299444",
                    "lon": "120.543333"
                },
                "7": {
                    "city": "苏州工业园区",
                    "AQI": "82",
                    "quality": "良",
                    "PM2.5Hour": "60μg/m³",
                    "PM2.5Day": "60μg/m³",
                    "PM10Hour": "88μg/m³",
                    "lat": "31.309722",
                    "lon": "120.669167"
                }
            }
        }
    ]
}
```
3. 根据城市名称获取城市id
- url： http://localhost:8080//cityid
- 请求参数 city_name
- 返回参数
{
    "reason": "查询成功",
    "result": [
        {
            "id": "1111",
            "province_id": "16",
            "city_name": "宝应"
        },
        {
            "id": "1112",
            "province_id": "16",
            "city_name": "滨海"
        },
        {
            "id": "1113",
            "province_id": "16",
            "city_name": "常熟"
        },
        {
            "id": "1114",
            "province_id": "16",
            "city_name": "常州"
        },
        {
            "id": "1115",
            "province_id": "16",
            "city_name": "大丰"
        },
        {
            "id": "1116",
            "province_id": "16",
            "city_name": "丹阳"
        },
        {
            "id": "1117",
            "province_id": "16",
            "city_name": "东海"
        },
        {
            "id": "1118",
            "province_id": "16",
            "city_name": "东台"
        },
        {
            "id": "1119",
            "province_id": "16",
            "city_name": "丰县"
        },
        {
            "id": "1120",
            "province_id": "16",
            "city_name": "阜宁"
        },
        {
            "id": "1121",
            "province_id": "16",
            "city_name": "赣榆"
        },
        {
            "id": "1122",
            "province_id": "16",
            "city_name": "高淳"
        },
        {
            "id": "1123",
            "province_id": "16",
            "city_name": "高邮"
        },
        {
            "id": "1124",
            "province_id": "16",
            "city_name": "灌南"
        },
        {
            "id": "1125",
            "province_id": "16",
            "city_name": "灌云"
        },
        {
            "id": "1126",
            "province_id": "16",
            "city_name": "海安"
        },
        {
            "id": "1127",
            "province_id": "16",
            "city_name": "海门"
        },
        {
            "id": "1128",
            "province_id": "16",
            "city_name": "洪泽"
        },
        {
            "id": "1129",
            "province_id": "16",
            "city_name": "淮安"
        },
        {
            "id": "1130",
            "province_id": "16",
            "city_name": "建湖"
        },
        {
            "id": "1131",
            "province_id": "16",
            "city_name": "江都"
        },
        {
            "id": "1132",
            "province_id": "16",
            "city_name": "江宁"
        },
        {
            "id": "1133",
            "province_id": "16",
            "city_name": "江阴"
        },
        {
            "id": "1134",
            "province_id": "16",
            "city_name": "姜堰"
        },
        {
            "id": "1135",
            "province_id": "16",
            "city_name": "金湖"
        },
        {
            "id": "1136",
            "province_id": "16",
            "city_name": "金坛"
        },
        {
            "id": "1137",
            "province_id": "16",
            "city_name": "靖江"
        },
        {
            "id": "1138",
            "province_id": "16",
            "city_name": "句容"
        },
        {
            "id": "1139",
            "province_id": "16",
            "city_name": "昆山"
        },
        {
            "id": "1140",
            "province_id": "16",
            "city_name": "溧水"
        },
        {
            "id": "1141",
            "province_id": "16",
            "city_name": "溧阳"
        },
        {
            "id": "1142",
            "province_id": "16",
            "city_name": "连云港"
        },
        {
            "id": "1143",
            "province_id": "16",
            "city_name": "涟水"
        },
        {
            "id": "1144",
            "province_id": "16",
            "city_name": "六合"
        },
        {
            "id": "1145",
            "province_id": "16",
            "city_name": "南京"
        },
        {
            "id": "1146",
            "province_id": "16",
            "city_name": "南通"
        },
        {
            "id": "1147",
            "province_id": "16",
            "city_name": "沛县"
        },
        {
            "id": "1148",
            "province_id": "16",
            "city_name": "邳州"
        },
        {
            "id": "1149",
            "province_id": "16",
            "city_name": "浦口"
        },
        {
            "id": "1150",
            "province_id": "16",
            "city_name": "启东"
        },
        {
            "id": "1151",
            "province_id": "16",
            "city_name": "如东"
        },
        {
            "id": "1152",
            "province_id": "16",
            "city_name": "如皋"
        },
        {
            "id": "1153",
            "province_id": "16",
            "city_name": "射阳"
        },
        {
            "id": "1154",
            "province_id": "16",
            "city_name": "沭阳"
        },
        {
            "id": "1155",
            "province_id": "16",
            "city_name": "泗洪"
        },
        {
            "id": "1156",
            "province_id": "16",
            "city_name": "泗阳"
        },
        {
            "id": "1157",
            "province_id": "16",
            "city_name": "苏州"
        },
        {
            "id": "1158",
            "province_id": "16",
            "city_name": "宿迁"
        },
        {
            "id": "1159",
            "province_id": "16",
            "city_name": "睢宁"
        },
        {
            "id": "1160",
            "province_id": "16",
            "city_name": "太仓"
        },
        {
            "id": "1161",
            "province_id": "16",
            "city_name": "泰兴"
        },
        {
            "id": "1162",
            "province_id": "16",
            "city_name": "泰州"
        },
        {
            "id": "1163",
            "province_id": "16",
            "city_name": "无锡"
        },
        {
            "id": "1164",
            "province_id": "16",
            "city_name": "吴江"
        },
        {
            "id": "1165",
            "province_id": "16",
            "city_name": "响水"
        },
        {
            "id": "1166",
            "province_id": "16",
            "city_name": "新沂"
        },
        {
            "id": "1167",
            "province_id": "16",
            "city_name": "兴化"
        },
        {
            "id": "1168",
            "province_id": "16",
            "city_name": "盱眙"
        },
        {
            "id": "1169",
            "province_id": "16",
            "city_name": "徐州"
        },
        {
            "id": "1170",
            "province_id": "16",
            "city_name": "盐城"
        },
        {
            "id": "1171",
            "province_id": "16",
            "city_name": "扬中"
        },
        {
            "id": "1172",
            "province_id": "16",
            "city_name": "扬州"
        },
        {
            "id": "1173",
            "province_id": "16",
            "city_name": "仪征"
        },
        {
            "id": "1174",
            "province_id": "16",
            "city_name": "宜兴"
        },
        {
            "id": "1175",
            "province_id": "16",
            "city_name": "张家港"
        },
        {
            "id": "1176",
            "province_id": "16",
            "city_name": "镇江"
        }
    ],
    "error_code": 0
}
3. 请求某个城市历史的天气情况 http://v.juhe.cn/historyWeather/weather?key=&city_id=1157&weather_date=2017-07-15
- url: http://localhost:8080/weather
- 请求参数：province_name（省名称） city_name(城市名称) weather_date(请求日期)2017-08-12
- 返回参数 
{
    "reason": "查询成功",
    "result": {
        "city_id": "1157",
        "city_name": "苏州",
        "weather_date": "2017-07-15",
        "day_weather": "多云",
        "night_weather": "晴",
        "day_temp": "33℃",
        "night_temp": "25℃",
        "day_wind": "无持续风向",
        "day_wind_comp": "≤3级",
        "night_wind": "无持续风向",
        "night_wind_comp": "≤3级",
        "day_weather_id": "01",
        "night_weather_id": "00"
    },
    "error_code": 0
}
4. 获得某个城市的天气预报信息
- url: http://localhost:8080/weather/city
- 请求参数 city_name
- 相应参数
{
    "resultcode": "200",
    "reason": "查询成功!",
    "result": {
        "sk": {	/*当前实况天气*/
            "temp": "21",	/*当前温度*/
            "wind_direction": "西风",	/*当前风向*/
            "wind_strength": "2级",	/*当前风力*/	
            "humidity": "4%",	/*当前湿度*/
            "time": "14:25"	/*更新时间*/
        },
        "today": {
            "city": "天津",
            "date_y": "2014年03月21日",
            "week": "星期五",
            "temperature": "8℃~20℃",	/*今日温度*/
            "weather": "晴转霾",	/*今日天气*/
            "weather_id": {	/*天气唯一标识*/
                "fa": "00",	/*天气标识00：晴*/
                "fb": "53"	/*天气标识53：霾 如果fa不等于fb，说明是组合天气*/
            },
            "wind": "西南风微风",
            "dressing_index": "较冷", /*穿衣指数*/
            "dressing_advice": "建议着大衣、呢外套加毛衣、卫衣等服装。",	/*穿衣建议*/
            "uv_index": "中等",	/*紫外线强度*/
            "comfort_index": "",/*舒适度指数*/
            "wash_index": "较适宜",	/*洗车指数*/
            "travel_index": "适宜",	/*旅游指数*/
            "exercise_index": "较适宜",	/*晨练指数*/
            "drying_index": ""/*干燥指数*/
        },
        "future": [	/*未来几天天气*/
            {
                "temperature": "28℃~36℃",
                "weather": "晴转多云",
                "weather_id": {
                    "fa": "00",
                    "fb": "01"
                },
                "wind": "南风3-4级",
                "week": "星期一",
                "date": "20140804"
            },
            {
                "temperature": "28℃~36℃",
                "weather": "晴转多云",
                "weather_id": {
                    "fa": "00",
                    "fb": "01"
                },
                "wind": "东南风3-4级",
                "week": "星期二",
                "date": "20140805"
            },
            {
                "temperature": "27℃~35℃",
                "weather": "晴转多云",
                "weather_id": {
                    "fa": "00",
                    "fb": "01"
                },
                "wind": "东南风3-4级",
                "week": "星期三",
                "date": "20140806"
            },
            {
                "temperature": "27℃~34℃",
                "weather": "多云",
                "weather_id": {
                    "fa": "01",
                    "fb": "01"
                },
                "wind": "东南风3-4级",
                "week": "星期四",
                "date": "20140807"
            },
            {
                "temperature": "27℃~33℃",
                "weather": "多云",
                "weather_id": {
                    "fa": "01",
                    "fb": "01"
                },
                "wind": "东北风4-5级",
                "week": "星期五",
                "date": "20140808"
            },
            {
                "temperature": "26℃~33℃",
                "weather": "多云",
                "weather_id": {
                    "fa": "01",
                    "fb": "01"
                },
                "wind": "北风4-5级",
                "week": "星期六",
                "date": "20140809"
            },
            {
                "temperature": "26℃~33℃",
                "weather": "多云",
                "weather_id": {
                    "fa": "01",
                    "fb": "01"
                },
                "wind": "北风4-5级",
                "week": "星期日",
                "date": "20140810"
            }
        ]
    },
    "error_code": 0
}

参考资料：
1. Chart.js画图 https://juejin.im/entry/59269900a0bb9f0057c62329





