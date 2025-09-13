package LW_01;

class Circle {
    float _radius;
    double PHI = Math.PI;
    double area;

    Circle(float radius) {
        _radius = radius;
    }

    public double computeArea() {
        return PHI * _radius * _radius;
    }
}
