/**
 * 在二维平面上，有一些点，请找出经过点数最多的那条线。
 * 给定一个点集 p和点集的大小n，请返回一个数组，代表经过点数最多的那条直线的斜率和截距。
 */
static class Line {
    double k, b;
 
    public Line(double k, double b) {
        this.k = round(k);
        this.b = round(b);
    }
 
    double round(double x) {
        double e = 0.00001;
        return ((int) (x / e)) * e;
    }
 
    public int hashCode() {
        return (int) (k + b);
    }
 
    public boolean equals(Object obj) {
        Line l = (Line) obj;
        return l.b == b && l.k == k;
    }
}

public double[] getLine(Point[] p, int n) {
    HashMap<Line,Integer> map=new HashMap<Line,Integer>();
    double mk=0,mb=0;
    int max=0;
    for(int i=0;p!=null&&i<n;i++){
        for(int j=i+1;j<n;j++){
            double k = (p[i].y - p[j].y) / (p[i].x - p[j].x);
            double b = p[i].y - k * p[i].x;
            Line line=new Line(k,b);
            Integer count=map.get(line);
            if(count==null){
                map.put(line,1);
                count=1;
            }else{
                map.put(line,++count);
            }
            if(cout>max){
                mk=k;
                mb=b;
                max=count;
            }

        }
    }
    return double[]{mk,mb};
}