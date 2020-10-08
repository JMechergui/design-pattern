package tn.design.pattern.Decorator;

public class TrimHelper implements StringHelper{

	private StringHelper stringHelper;

	public TrimHelper(StringHelper stringHelper) {
		super();
		this.stringHelper = stringHelper;
	}

	@Override
	public String execute() {
	 
		if(stringHelper.execute()!=null)
			return stringHelper.execute().trim();
		else
			return null;
	}
	
}
