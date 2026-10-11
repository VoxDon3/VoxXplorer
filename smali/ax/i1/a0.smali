.class public final synthetic Lax/i1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i1/T$a;


# instance fields
.field public final synthetic a:Lax/q1/x;


# direct methods
.method public synthetic constructor <init>(Lax/q1/x;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/a0;->a:Lax/q1/x;

    return-void
.end method


# virtual methods
.method public final a(Lax/Z0/I1;)Lax/i1/T;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/a0;->a:Lax/q1/x;

    invoke-static {v0, p1}, Lax/i1/Z$b;->h(Lax/q1/x;Lax/Z0/I1;)Lax/i1/T;

    move-result-object p1

    return-object p1
.end method
