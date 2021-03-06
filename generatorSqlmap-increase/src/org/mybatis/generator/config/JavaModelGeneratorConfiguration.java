// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JavaModelGeneratorConfiguration.java

package org.mybatis.generator.config;

import java.util.List;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtility;
import org.mybatis.generator.internal.util.messages.Messages;

// Referenced classes of package org.mybatis.generator.config:
//			PropertyHolder

public class JavaModelGeneratorConfiguration extends PropertyHolder
{

	private String targetPackage;
	private String targetProject;

	public JavaModelGeneratorConfiguration()
	{
	}

	public String getTargetProject()
	{
		return targetProject;
	}

	public void setTargetProject(String targetProject)
	{
		this.targetProject = targetProject;
	}

	public String getTargetPackage()
	{
		return targetPackage;
	}

	public void setTargetPackage(String targetPackage)
	{
		this.targetPackage = targetPackage;
	}

	public XmlElement toXmlElement()
	{
		XmlElement answer = new XmlElement("javaModelGenerator");
		if (targetPackage != null)
			answer.addAttribute(new Attribute("targetPackage", targetPackage));
		if (targetProject != null)
			answer.addAttribute(new Attribute("targetProject", targetProject));
		addPropertyXmlElements(answer);
		return answer;
	}

	public void validate(List errors, String contextId)
	{
		if (!StringUtility.stringHasValue(targetProject))
			errors.add(Messages.getString("ValidationError.0", contextId));
		if (!StringUtility.stringHasValue(targetPackage))
			errors.add(Messages.getString("ValidationError.12", "JavaModelGenerator", contextId));
	}
}