public Double KinkinTest(){

        double num = 11.8;
        // round 四舍五入不保留小数点
        System.out.println(Math.round(num));
        // ceil 向上取整（比自己大的最小整数），保留小数点
        System.out.println(Math.ceil(num));
        // floor 向下取整（比自己小的最大整数），保留小数点
        System.out.println(Math.floor(num));
        // rint 四舍五入保留小数点
        System.out.println(Math.rint(num));

        return num;
}