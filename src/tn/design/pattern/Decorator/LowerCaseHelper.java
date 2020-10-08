package tn.design.pattern.Decorator;

public class LowerCaseHelper implements StringHelper{

	private StringHelper stringHelper;

	public LowerCaseHelper(StringHelper stringHelper) {
		super();
		this.stringHelper = stringHelper;
	}

	@Override
	public String execute() {
	 
		if(stringHelper.execute()!=null)
			return stringHelper.execute().toLowerCase();
		else
			return null;
	}
	
}
