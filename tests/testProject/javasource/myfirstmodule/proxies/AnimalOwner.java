// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class AnimalOwner
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject animalOwnerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.AnimalOwner";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		AnimalOwner_Animal("MyFirstModule.AnimalOwner_Animal");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public AnimalOwner(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.AnimalOwner"));
	}

	protected AnimalOwner(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject animalOwnerMendixObject)
	{
		if (animalOwnerMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.AnimalOwner", animalOwnerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.AnimalOwner");

		this.animalOwnerMendixObject = animalOwnerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AnimalOwner.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.AnimalOwner initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.AnimalOwner.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.AnimalOwner initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.AnimalOwner(context, mendixObject);
	}

	public static myfirstmodule.proxies.AnimalOwner load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.AnimalOwner.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.AnimalOwner> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.AnimalOwner> result = new java.util.ArrayList<myfirstmodule.proxies.AnimalOwner>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.AnimalOwner" + xpathConstraint))
			result.add(myfirstmodule.proxies.AnimalOwner.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of AnimalOwner_Animal
	 */
	public final myfirstmodule.proxies.Animal getAnimalOwner_Animal() throws com.mendix.core.CoreException
	{
		return getAnimalOwner_Animal(getContext());
	}

	/**
	 * @param context
	 * @return value of AnimalOwner_Animal
	 */
	public final myfirstmodule.proxies.Animal getAnimalOwner_Animal(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Animal result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AnimalOwner_Animal.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Animal.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AnimalOwner_Animal
	 * @param animalowner_animal
	 */
	public final void setAnimalOwner_Animal(myfirstmodule.proxies.Animal animalowner_animal)
	{
		setAnimalOwner_Animal(getContext(), animalowner_animal);
	}

	/**
	 * Set value of AnimalOwner_Animal
	 * @param context
	 * @param animalowner_animal
	 */
	public final void setAnimalOwner_Animal(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Animal animalowner_animal)
	{
		if (animalowner_animal == null)
			getMendixObject().setValue(context, MemberNames.AnimalOwner_Animal.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AnimalOwner_Animal.toString(), animalowner_animal.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return animalOwnerMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.AnimalOwner that = (myfirstmodule.proxies.AnimalOwner) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.AnimalOwner";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
