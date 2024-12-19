/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Maintask4 extends ASTRAClass {
	public Maintask4() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Maintask4", new int[] {13,5,13,24},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Maintask4", new int[] {13,23,19,1},
				new Statement[] {
					new ModuleCall("ei",
						"Maintask4", new int[] {14,4,14,49},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("hw"),
							Primitive.newPrimitive("dependency/tower-1.3.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Maintask4", new int[] {15,4,15,13},
						new Predicate("init", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).init(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Maintask4", new int[] {16,4,16,14},
						new Predicate("start", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).start(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Maintask4", new int[] {17,4,17,22},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("gripper")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"Maintask4", new int[] {18,4,18,60},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Press New Block until block d is created...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Maintask4","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Maintask4", new int[] {22,5,22,29},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("block", new Term[] {
						Primitive.newPrimitive("d")
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Maintask4","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Maintask4", new int[] {22,28,26,1},
				new Statement[] {
					new ModuleCall("C",
						"Maintask4", new int[] {23,4,23,65},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("You did it! Block D is created and on the table.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Maintask4","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Maintask4", new int[] {25,4,25,18},
						new Predicate("pickup", new Term[] {
							Primitive.newPrimitive("a")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Maintask4", new int[] {29,5,29,49},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("holding", new Term[] {
						Primitive.newPrimitive("a")
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Maintask4","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("is_built", new Term[] {
				Primitive.newPrimitive(false)
			}),
			new Block(
				"Maintask4", new int[] {29,48,31,1},
				new Statement[] {
					new ModuleCall("ei",
						"Maintask4", new int[] {30,4,30,24},
						new Predicate("putdown", new Term[] {
							Primitive.newPrimitive("a"),
							Primitive.newPrimitive("b")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Maintask4", new int[] {34,5,34,31},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("on", new Term[] {
						Primitive.newPrimitive("a"),
						Primitive.newPrimitive("b")
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Maintask4","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Maintask4", new int[] {34,30,45,1},
				new Statement[] {
					new If(
						"Maintask4", new int[] {35,4,45,1},
						new NOT(
							new Predicate("is_built", new Term[] {
								Primitive.newPrimitive(true)
							})
						),
						new Block(
							"Maintask4", new int[] {35,25,44,5},
							new Statement[] {
								new ModuleCall("D",
									"Maintask4", new int[] {36,8,36,23},
									new Predicate("dumpBeliefs", new Term[] {}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Debug) intention.getModule("Maintask4","D")).dumpBeliefs(
											);
										}
									}
								),
								new BeliefUpdate('-',
									"Maintask4", new int[] {37,8,44,5},
									new Predicate("is_built", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new BeliefUpdate('+',
									"Maintask4", new int[] {38,8,44,5},
									new Predicate("is_built", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new ModuleCall("C",
									"Maintask4", new int[] {39,8,39,32},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("TOWER BUILT")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Maintask4","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new ModuleCall("D",
									"Maintask4", new int[] {40,8,40,23},
									new Predicate("dumpBeliefs", new Term[] {}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Debug) intention.getModule("Maintask4","D")).dumpBeliefs(
											);
										}
									}
								),
								new ModuleCall("S",
									"Maintask4", new int[] {42,8,42,20},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(2000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Maintask4","S")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new ModuleCall("ei",
									"Maintask4", new int[] {43,8,43,22},
									new Predicate("pickup", new Term[] {
										Primitive.newPrimitive("a")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Maintask4", new int[] {48,5,48,31},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("holding", new Term[] {
						Primitive.newPrimitive("a")
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Maintask4","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Maintask4", new int[] {48,30,50,1},
				new Statement[] {
					new ModuleCall("ei",
						"Maintask4", new int[] {49,4,49,28},
						new Predicate("putdown", new Term[] {
							Primitive.newPrimitive("a"),
							Primitive.newPrimitive("table")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Maintask4","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Maintask4", new int[] {53,5,53,35},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("on", new Term[] {
						Primitive.newPrimitive("a"),
						Primitive.newPrimitive("table")
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Maintask4","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Maintask4", new int[] {53,34,55,1},
				new Statement[] {
					new ModuleCall("C",
						"Maintask4", new int[] {54,4,54,25},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("FINISHED")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Maintask4","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Maintask4", new int[] {58,5,58,31},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Variable(Type.FUNCTION, "belief",false)
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Maintask4","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Maintask4", new int[] {58,30,60,1},
				new Statement[] {
					new ModuleCall("C",
						"Maintask4", new int[] {59,4,59,48},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("New Perception Event: "),
								new Variable(Type.FUNCTION, "belief")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Maintask4","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("Maintask4","ei")).sense();
			}
		});

		agent.initialize(
			new Predicate("is_built", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("D",astra.lang.Debug.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Maintask4().newInstance(name);
			if (!agent.isRunnable()) {
				java.lang.System.out.println("WARNING: No +!main(...) rule has been defined for main agent type: Maintask4");
			}
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
