package tn.design.pattern.Decorator;

public class UpperCaseHelper implements StringHelper{

	private StringHelper stringHelper;

	public UpperCaseHelper(StringHelper stringHelper) {
		super();
		this.stringHelper = stringHelper;
	}

	@Override
	public String execute() {
	 
		if(stringHelper.execute()!=null)
			return stringHelper.execute().toUpperCase();
		else
			return null;
	}
	
}
