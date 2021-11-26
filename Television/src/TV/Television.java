package TV;

public class Television {
int channel=7;
int volumelevel=98;
boolean start= true;

public Television()
{}
public Television(int channel)
{
	this.channel= channel;
}
public Television(int channel,int volumelevel)
{
	this(channel);
    this.volumelevel= volumelevel;
}
public Television(int channel,int volumelevel,boolean start)
{
	this(channel,volumelevel);
    this.start= start;
}
}











