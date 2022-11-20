/*Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
який повинен приймати радіус та використовуючи PI порахувати площу кола.
Створити клас Main, де запустити цей метод. */

package hw2.task4;

public class MyArea {
    static final float PI = 3.14f;
    float radius;

    static float AreaOfCircle(float radius) {
        float area = (float) (PI * Math.pow(radius, 2));
        return area;
    }
}
