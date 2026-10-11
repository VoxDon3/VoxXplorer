.class public final synthetic Lax/N1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:Lax/N1/o;


# direct methods
.method public synthetic constructor <init>(Lax/N1/o;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/N1/n;->a:Lax/N1/o;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/N1/n;->a:Lax/N1/o;

    check-cast p1, Lax/N1/e;

    invoke-static {v0, p1}, Lax/N1/o;->g(Lax/N1/o;Lax/N1/e;)V

    return-void
.end method
