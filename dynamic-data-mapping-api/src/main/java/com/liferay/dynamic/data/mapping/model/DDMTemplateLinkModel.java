/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.AttachedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the DDMTemplateLink service. Represents a row in the &quot;DDMTemplateLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.dynamic.data.mapping.model.impl.DDMTemplateLinkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.dynamic.data.mapping.model.impl.DDMTemplateLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMTemplateLink
 * @see com.liferay.dynamic.data.mapping.model.impl.DDMTemplateLinkImpl
 * @see com.liferay.dynamic.data.mapping.model.impl.DDMTemplateLinkModelImpl
 * @generated
 */
@ProviderType
public interface DDMTemplateLinkModel extends AttachedModel,
	BaseModel<DDMTemplateLink>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a d d m template link model instance should use the {@link DDMTemplateLink} interface instead.
	 */

	/**
	 * Returns the primary key of this d d m template link.
	 *
	 * @return the primary key of this d d m template link
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this d d m template link.
	 *
	 * @param primaryKey the primary key of this d d m template link
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the template link ID of this d d m template link.
	 *
	 * @return the template link ID of this d d m template link
	 */
	public long getTemplateLinkId();

	/**
	 * Sets the template link ID of this d d m template link.
	 *
	 * @param templateLinkId the template link ID of this d d m template link
	 */
	public void setTemplateLinkId(long templateLinkId);

	/**
	 * Returns the company ID of this d d m template link.
	 *
	 * @return the company ID of this d d m template link
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this d d m template link.
	 *
	 * @param companyId the company ID of this d d m template link
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the fully qualified class name of this d d m template link.
	 *
	 * @return the fully qualified class name of this d d m template link
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this d d m template link.
	 *
	 * @return the class name ID of this d d m template link
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this d d m template link.
	 *
	 * @param classNameId the class name ID of this d d m template link
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this d d m template link.
	 *
	 * @return the class p k of this d d m template link
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class p k of this d d m template link.
	 *
	 * @param classPK the class p k of this d d m template link
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the template ID of this d d m template link.
	 *
	 * @return the template ID of this d d m template link
	 */
	public long getTemplateId();

	/**
	 * Sets the template ID of this d d m template link.
	 *
	 * @param templateId the template ID of this d d m template link
	 */
	public void setTemplateId(long templateId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.dynamic.data.mapping.model.DDMTemplateLink ddmTemplateLink);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.dynamic.data.mapping.model.DDMTemplateLink> toCacheModel();

	@Override
	public com.liferay.dynamic.data.mapping.model.DDMTemplateLink toEscapedModel();

	@Override
	public com.liferay.dynamic.data.mapping.model.DDMTemplateLink toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}