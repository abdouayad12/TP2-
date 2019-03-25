public class Polynome {
	double a=0,b=0,c=0;
	public  Polynome(double a,double b,double c)
	{
		this.a=a;this.b=b;this.c=c;
    }
	public Polynome()
	{
		a=0;b=0;c=0;
	}
	public double geta()
	{
		return a;
	}
	public double getb()
	{
		return b;
	}
	public double getc()
	{
		return c;
	}
    public void seta(double a)
    {
    	this.a=a;
    }
    public void setb(double b)
    {
    	this.b=b;
    }
    public void setc(double c)
    {
    	this.c=c;
    }
    public double evaluer(int val)
    {
    	return (a*Math.pow(val,2)+b*val+c);
    }
    public void multicoef(int val)
    {
    	a=a*val;
    	b=b*val;
    	c=c*val;
    }
    public Polynome somme(Polynome ap)
    {
    	ap.a+=this.a;
    	ap.b+=this.b;
    	ap.c+=this.c;
    	return ap;
    }
    public Polynome derive()
    {
    	this.a=2*a;
    	this.b=b;
    	this.c=0;
    	return this;
    }
    public double evaluerderive(int val)
    {
    	return (2*a*val+b);
    }
    public double discriminant()
    {double d;
    d=(b*b)-(4*a*c);
    return d;
    
    }
    public void afficherRacines()
    {double d;
    d=b*b-4*a*c;
    	if(d<0)
    	   {
    		System.out.println("erreur!!");
    	   }
    	else if(d==0)
    	   {
    		System.out.println("racine double="+(-b/2*a));	
    	   }
    	else 
    	   {
    		System.out.println("la 1ere racine="+((-b+Math.sqrt(d))/2*a)+"la 2eme racine="+((-b-Math.sqrt(d))/2*a));
    	   } 
    	
    }
    public String tostring()
    {
    	return("[ a.x^2 + b.x + c ]");
    }
    public void afficher()
    {
    	System.out.println(a+"x^2+"+b+"x+"+c);
    }   
}