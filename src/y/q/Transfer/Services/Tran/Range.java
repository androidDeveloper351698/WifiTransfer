package y.q.Transfer.Services.Tran;

/**
 * Created by Cfun on 2015/4/26.
 */
public class Range
{
	int beginByte;
	int endByte;

	public Range()
	{
	}

	public Range(String str)
	{
		int index = str.indexOf('-');
		if (index < 0)
			throw new IllegalArgumentException(str);
		String begStr = str.substring(0, index);
		String endStr = str.substring(index + 1);
		this.setBeginByte(Integer.parseInt(begStr));
		if (endStr != null && endStr.length() > 0)
			this.setEndByte(Integer.parseInt(endStr));
	}

	public int getBeginByte()
	{
		return beginByte;
	}

	public void setBeginByte(int beginByte)
	{
		if (beginByte < 0)
			beginByte = 0;
		this.beginByte = beginByte;
		if (this.beginByte > this.endByte)
			this.endByte = beginByte;
	}

	public int getEndByte()
	{
		return endByte;
	}

	public void setEndByte(int endByte)
	{
		if (endByte < this.beginByte)
			this.endByte = this.beginByte;
		else
			this.endByte = endByte;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Range)
		{
			if(((Range)o).getBeginByte() == this.getBeginByte() && ((Range)o).getEndByte() == this.getEndByte())
				return true;
		}
		return false;
	}
}