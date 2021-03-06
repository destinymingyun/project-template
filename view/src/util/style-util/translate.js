/**
 * 平移js
 * @author xingchen
 **/
class Translate {
    /**
     * 水平移动元素,每10毫秒刷新一次位置
     * @param start: 开始X坐标位置,em单位
     * @param end: 结束X坐标位置， em单位
     * @param time： 移动时间，以秒来计算
     * @param element: 需要移动的元素
     * */
    static translateX(start, end, time, element) {
        let step = (end - start) / (time * 100);
        if (step === 0) {
            return;
        }
        let begin = start;
        let translate = setInterval(() => {
            begin += step;
            element.style.transform = `translateX(${begin}em)`;
            if ((begin > end && step > 0) || (step < 0 && begin < end)) {
                element.style.transform = `translateX(${end})`;
                clearInterval(translate);
            }
        }, 10);
    }
}

export default Translate;